import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BigComponentComponent } from './big-component.component';

describe('BigComponentComponent', () => {
  let component: BigComponentComponent;
  let fixture: ComponentFixture<BigComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BigComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BigComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
