package nextstep.domain;

import org.springframework.data.repository.CrudRepository;

public interface DeleteHistoryRepository extends CrudRepository<DeleteHistory, Long> {
    Iterable<DeleteHistory> deleteById(long id);
}