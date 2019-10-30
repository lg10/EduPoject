package cn.hoook.utils.dao;


import java.sql.SQLException;
import java.util.Set;

/**
 * 表示定义公共接口
 * @param <K>表示主键类型
 * @param <V>表示对象
 */
public interface IDAO<K,V>{
    public boolean doCreate(V vo)throws SQLException;//修改接口
    public boolean doUpdate(V vo)throws SQLException;//更新接口
    public boolean doRemoveBatch(Set<K> ids)throws SQLException;//删除接口
    public V findById(K id)throws SQLException;//列表接口
}
