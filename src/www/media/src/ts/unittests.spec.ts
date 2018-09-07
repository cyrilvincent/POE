import { async, ComponentFixture, TestBed } from '@angular/core/testing';

describe('FirstSimpleTest', function () {
  let i = 1;
  i = i + 1;
  it('should be 2', () => expect(i).toBe(2) );
});
