import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://demo.playwright.dev/todomvc/');
  await page.goto('https://demo.playwright.dev/todomvc/#/');
  await page.goto('https://www.google.com/search?q=wiki&oq=wiki&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDQyOThqMGo0qAIAsAIB&sourceid=chrome&ie=UTF-8');
  await page.getByRole('link', { name: 'Wikipedia, bách khoa toàn th' }).click();
  await page.getByPlaceholder('Tìm kiếm trên Wikipedia').click();
  await page.getByPlaceholder('Tìm kiếm trên Wikipedia').fill('open ai');
  await page.getByPlaceholder('Tìm kiếm trên Wikipedia').press('Enter');
  await page.getByRole('link', { name: 'Huấn luyện' }).click();
  await page.getByRole('link', { name: 'Tính năng' }).click();
  await page.getByRole('link', { name: 'Dịch vụ' }).click();
  await page.getByRole('link', { name: 'Đón nhận, chỉ trích, và những' }).click();
  await page.getByRole('link', { name: 'Phản ứng tích cực' }).click();
  await page.getByRole('link', { name: 'Phản ứng tiêu cực' }).click();
  await page.getByRole('link', { name: 'Tác động đến nền giáo dục' }).click();
});
