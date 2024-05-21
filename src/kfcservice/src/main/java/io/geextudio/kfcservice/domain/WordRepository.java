package io.geextudio.kfcservice.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface WordRepository extends CrudRepository<Word, Integer> {

    List<Word> findByText(String text);

    List<Word> findByTranslation(String translation);
}
