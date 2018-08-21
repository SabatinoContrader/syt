import { TestBed, inject } from '@angular/core/testing';

import { SearchFromGiudiceService } from './search-from-giudice.service';

describe('SearchFromGiudiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SearchFromGiudiceService]
    });
  });

  it('should be created', inject([SearchFromGiudiceService], (service: SearchFromGiudiceService) => {
    expect(service).toBeTruthy();
  }));
});