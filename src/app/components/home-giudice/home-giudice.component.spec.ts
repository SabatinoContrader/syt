import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeGiudiceComponent } from './home-giudice.component';

describe('HomeGiudiceComponent', () => {
  let component: HomeGiudiceComponent;
  let fixture: ComponentFixture<HomeGiudiceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeGiudiceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeGiudiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
