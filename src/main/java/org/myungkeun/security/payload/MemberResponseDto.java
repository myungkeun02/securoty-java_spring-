package org.myungkeun.security.payload;

import lombok.Data;
import org.myungkeun.security.entity.Member;

import java.util.List;

@Data
public class MemberResponseDto {
    private List<Member> content;
    private int pageNo;
    private int pageSize;
    private Long totalElements;
    private int totalPages;
    private boolean last;
}
