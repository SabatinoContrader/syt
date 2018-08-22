import { TestBed, inject } from '@angular/core/testing';

import { RegistrazioneService } from './registrazione.service';

describe('RegistrazioneService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RegistrazioneService]
    });
  });

  it('should be created', inject([RegistrazioneService], (service: RegistrazioneService) => {
    expect(service).toBeTruthy();
  }));
});
