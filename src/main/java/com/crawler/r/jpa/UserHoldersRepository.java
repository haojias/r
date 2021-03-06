package com.crawler.r.jpa;

import com.crawler.r.entity.TokenUser;
import com.crawler.r.entity.UserHolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

/**
 * TargetToken jpa 接口层
 */
public interface UserHoldersRepository extends JpaRepository<UserHolders, Long>, Serializable {

    @Query(value = "select uh from UserHolders uh where uh.targetId=:id and uh.uAddress=:address",nativeQuery = false)
    UserHolders findByTargetIdAndUAddress(@Param("id") Long id,@Param("address") String addess);

    @Query(value = "SELECT * FROM holders tt WHERE tt.flag='0'",nativeQuery = true)
    List<UserHolders> selectByFlag();

    @Query(value = "SELECT * FROM holders WHERE percentage IS NULL",nativeQuery = true)
    List<UserHolders> getListHolders();

}
