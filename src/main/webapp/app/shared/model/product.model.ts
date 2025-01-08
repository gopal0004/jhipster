export interface IProduct {
  id?: string;
  prodId?: number | null;
  prodName?: string | null;
  price?: number | null;
}

export const defaultValue: Readonly<IProduct> = {};
