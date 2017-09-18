package guanziqiang.dao.mybatis;

import org.springframework.stereotype.Repository;

import guanziqiang.entities.UserDO;

@Repository
public interface UserDAO {

	/**
	 * 插入一条新的UserDO。
	 * @param userDO
	 * @return 插入成功的条数
	 */
	int insert(UserDO userDO);
	
}
