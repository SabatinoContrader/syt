import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeCantanteComponent } from './home-cantante.component';

describe('HomeCantanteComponent', () => {
  let component: HomeCantanteComponent;
  let fixture: ComponentFixture<HomeCantanteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeCantanteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeCantanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
