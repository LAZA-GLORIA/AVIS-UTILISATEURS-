package app.nosybe.avis.service.avis.impl;

import app.nosybe.avis.dto.AvisDTO;
import app.nosybe.avis.repository.AvisRepository;
import app.nosybe.avis.service.avis.AvisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AvisServiceImpl implements AvisService {
    private final AvisRepository avisRepository;

//    public void creer(AvisDTO avis) {
//        this.avisRepository.save(avis);
//    }
//

}
