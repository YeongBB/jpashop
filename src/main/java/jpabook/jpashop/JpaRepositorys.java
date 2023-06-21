package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public class JpaRepositorys extends JpaRepository<Long, Member> {
}
