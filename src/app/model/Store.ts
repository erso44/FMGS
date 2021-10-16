export class Store {
  page: string;
  element: string;
  value: string;
  userUUID: string | undefined;

  constructor(page: string, element: string, value: string, userUUID: string | undefined) {
    this.page = page;
    this.element = element;
    this.value = value;
    this.userUUID = userUUID;
  }
}
