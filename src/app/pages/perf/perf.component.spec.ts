import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfComponent } from './perf.component';

describe('PerfComponent', () => {
  let component: PerfComponent;
  let fixture: ComponentFixture<PerfComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PerfComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
