import { test, expect } from '@playwright/test';

test('watch first video on YouTube', async ({ page }) => {
  // Mở trang YouTube
  await page.goto('https://www.youtube.com/');
  
  // Nhập từ khóa vào ô tìm kiếm trên YouTube
  const youtubeSearchInput = await page.waitForSelector('input#search');
  await youtubeSearchInput.type('Playwright tutorial');
  await youtubeSearchInput.press('Enter');

  // Chờ kết quả tìm kiếm trên YouTube
  await page.waitForNavigation();

  // Click vào video đầu tiên từ kết quả tìm kiếm
  const firstVideoLink = await page.waitForSelector('a#video-title');
  await firstVideoLink.click();

  // Chờ trang video load
  await page.waitForNavigation();

  // Thực hiện hơn 10 thao tác bổ sung trên trang video
  // Ví dụ: tìm và click vào nút "Like", "Subscribe", "Share", vv.
  await page.waitForSelector('button#like-button');
  await page.click('button#like-button');
  await page.waitForSelector('button#subscribe-button');
  await page.click('button#subscribe-button');
  await page.waitForSelector('button#share-button');
  await page.click('button#share-button');

  // Chờ một thời gian để xem video hoặc thực hiện các thao tác khác
  await page.waitForTimeout(5000);
});
