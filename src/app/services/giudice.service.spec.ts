import { TestBed, inject } from '@angular/core/testing';

import { GiudiceService } from './giudice.service';

describe('GiudiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [GiudiceService]
    });
  });

  it('should be created', inject([GiudiceService], (service: GiudiceService) => {
    expect(service).toBeTruthy();
  }));
});
