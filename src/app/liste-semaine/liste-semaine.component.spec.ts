import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListeSemaineComponent } from './liste-semaine.component';

describe('ListeSemaineComponent', () => {
  let component: ListeSemaineComponent;
  let fixture: ComponentFixture<ListeSemaineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListeSemaineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListeSemaineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
