import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModuleCharactersComponent } from './module-characters.component';

describe('ModuleCharactersComponent', () => {
  let component: ModuleCharactersComponent;
  let fixture: ComponentFixture<ModuleCharactersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModuleCharactersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModuleCharactersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
