import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeJourComponent } from './liste-jour.component';

describe('ListeJourComponent', () => {
  let component: ListeJourComponent;
  let fixture: ComponentFixture<ListeJourComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeJourComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeJourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
