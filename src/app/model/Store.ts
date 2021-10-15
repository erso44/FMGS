export class Store {
  page: string;
  element: string;
  value: string;
  constructor(page: string, element: string, value: string) {
    this.page = page;
    this.element = element;
    this.value = value;
  }
}
