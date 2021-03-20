package org.mybatis.jpetstore.order.persistence;

import org.mybatis.jpetstore.order.domain.Sequence;

public interface SequenceMapper {

    // 得到序列
    Sequence getSequence(Sequence sequence);

    // 更新序列
    boolean updateSequence(Sequence sequence);
}
