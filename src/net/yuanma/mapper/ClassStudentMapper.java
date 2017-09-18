package net.yuanma.mapper;

import java.util.List;
import net.yuanma.model.ClassStudent;
import net.yuanma.model.ClassStudentExample;
import org.apache.ibatis.annotations.Param;

public interface ClassStudentMapper {
    int countByExample(ClassStudentExample example);

    int deleteByExample(ClassStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassStudent record);

    int insertSelective(ClassStudent record);

    List<ClassStudent> selectByExample(ClassStudentExample example);

    ClassStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassStudent record, @Param("example") ClassStudentExample example);

    int updateByExample(@Param("record") ClassStudent record, @Param("example") ClassStudentExample example);

    int updateByPrimaryKeySelective(ClassStudent record);

    int updateByPrimaryKey(ClassStudent record);
}