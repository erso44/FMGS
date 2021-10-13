import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PROGComponent } from './prog.component';

describe('PROGComponent', () => {
  let component: PROGComponent;
  let fixture: ComponentFixture<PROGComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PROGComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PROGComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
