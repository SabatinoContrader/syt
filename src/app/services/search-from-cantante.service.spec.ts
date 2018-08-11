import { TestBed, inject } from '@angular/core/testing';

import { SearchFromCantanteService } from './search-from-cantante.service';

describe('SearchFromCantanteService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SearchFromCantanteService]
    });
  });

  it('should be created', inject([SearchFromCantanteService], (service: SearchFromCantanteService) => {
    expect(service).toBeTruthy();
  }));
});
