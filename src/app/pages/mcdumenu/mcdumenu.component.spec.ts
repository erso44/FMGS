import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MCDUMenuComponent } from './mcdumenu.component';

describe('MCDUMenuComponent', () => {
  let component: MCDUMenuComponent;
  let fixture: ComponentFixture<MCDUMenuComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MCDUMenuComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MCDUMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
