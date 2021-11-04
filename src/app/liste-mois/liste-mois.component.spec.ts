import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeMoisComponent } from './liste-mois.component';

describe('ListeMoisComponent', () => {
  let component: ListeMoisComponent;
  let fixture: ComponentFixture<ListeMoisComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeMoisComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeMoisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
