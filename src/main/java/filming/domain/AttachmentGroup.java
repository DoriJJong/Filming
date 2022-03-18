package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class AttachmentGroup extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "ATTACHMENTGROUP_SEQ")
    private Long seq;

    private String fileRoute;

}