namespace BankAccountEntities {
    export interface IBankAccount {
        id: number;
        owner: Customer;
        balance: number;
        creationDate: Date;
        transactions: Array<Transaction>;
    }

    export class BankAccount implements IBankAccount {
        private _id: number;
        private _owner: Customer;
        protected _balance: number = 0;
        private _creationDate: Date = new Date();
        private static _accountCounter: number = 0;
        private _transactions: Array<Transaction> = new Array<Transaction>();

        constructor(id:number, owner:Customer) {
            this._id = id;
            this._owner = owner;
            BankAccount. _accountCounter++;
        }

        get transactions(): Array<Transaction> {
            return this._transactions;
        }

        get id(): number {
            return this._id;
        }

        get owner(): Customer {
            return this._owner;
        }

        get creationDate(): Date {
            return this._creationDate;
        }

        get balance(): number {
            return this._balance;
        }

        deposit(amount: number) {
            this._balance += amount;
            this._transactions.push(new Transaction(0,new Date(),amount));
        }

        withdraw(amount: number) {
            if(this._balance >= amount) {
                this._balance -= amount;
                this._transactions.push(new Transaction(0,new Date(),-amount));
            }
            else {
                throw new RangeError("Amount error");
            }
        }

        static accountNumber(): number {
            return BankAccount._accountCounter;
        }
    }

    export class InterestBankAccount extends BankAccount {
        private _interest: number;

        constructor(id:number, owner:Customer, interest: number) {
            super(id, owner);
            this._interest = interest;
        }

        get interest():number {
            return this._interest;
        }
        set interest(interest: number) {
            this._interest = interest;
        }

        get balance(): number {
            return this._balance * (1 + this.interest);
        }
    }

    export class Customer {
        constructor(private _id: number, private _firstName: string, private _lastName: string) {}

        get id(): number {
            return this._id;
        }

        get firstName(): string {
            return this._firstName;
        }
        set firstName(firstName: string) {
            this._firstName = firstName;
        }

        get lastName(): string {
            return this._lastName;
        }
        set lastName(lastName: string) {
            this._lastName = lastName;
        }
    }

    export class Transaction {
        constructor(
            public id: number,
            public date: Date,
            public amount: number
        ) {}
    }

    export interface Bank {
        id: number;
        name: string;
        accounts : Array<BankAccount>;
    }
}

console.log("BankAccount");
import bae = BankAccountEntities;
let cust:bae.Customer = new bae.Customer(1,"Cyril","Vincent");
let ba:bae.BankAccount = new bae.BankAccount(1,cust);
ba.deposit(1000);
ba.withdraw(500);
console.log(ba);
let iba:bae.InterestBankAccount = new bae.InterestBankAccount(1,cust,0.01);
iba.deposit(1000);
console.log(iba);
let b:bae.Bank = {
    id:1, 
    name:"EuroBank", 
    accounts:[new bae.BankAccount(1,cust), new bae.BankAccount(2,cust)]
};
console.log(b);
