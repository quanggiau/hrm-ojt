import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Vm001001SearchComponent } from './vm001001-search.component';

describe('Vm001001SearchComponent', () => {
  let component: Vm001001SearchComponent;
  let fixture: ComponentFixture<Vm001001SearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Vm001001SearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Vm001001SearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
