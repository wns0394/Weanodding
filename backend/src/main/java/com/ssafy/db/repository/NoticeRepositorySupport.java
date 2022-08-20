package com.ssafy.db.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.db.entity.QHall;
import com.ssafy.db.entity.QNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 유저 모델 관련 디비 쿼리 생성을 위한 구현 정의.
 */
@Repository
public class NoticeRepositorySupport {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;
    QNotice qNotice = QNotice.notice;

}
