package codesquad.domain;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
    Iterable<Issue> findByDeleted(boolean deleted);
=======

import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Long> {
	Iterable<Issue> findByDeleted(boolean deleted);
	Issue findBySubject(String subject);
>>>>>>> 2ba5733f5080f8043e055d058b956d40ab59bea8
}
