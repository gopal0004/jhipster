import dayjs from 'dayjs';
import { IProduct } from 'app/shared/model/product.model';

export interface ICustomer {
  id?: string;
  custId?: number | null;
  custName?: string | null;
  email?: string | null;
  phoneNo?: string | null;
  address?: string | null;
  orderDate?: string | null;
  product?: IProduct | null;
}

export const defaultValue: Readonly<ICustomer> = {};
