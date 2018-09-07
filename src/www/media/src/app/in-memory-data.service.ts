import { InMemoryDbService } from 'angular-in-memory-web-api';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const books = [{"type":"book","authorList":[],"id":3,"price":15.0,"title":"Postgres","nbPage":0},{"type":"book","authorList":[],"id":4,"price":18.0,"title":"Angular","nbPage":0},{"type":"book","authorList":[],"id":5,"price":25.3,"title":"sql","nbPage":0},{"type":"book","authorList":[],"id":1,"price":21.9,"title":"Java","nbPage":0},{"type":"book","authorList":[],"id":2,"price":11.0,"title":"Python","nbPage":0},{"type":"book","authorList":[],"id":6,"price":99.0,"title":"REST","nbPage":0}];
    return {books};
  }
}
