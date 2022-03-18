package filming.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Attachment extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long seq;

    @ManyToOne
    @JoinColumn(name = "ATTACHMENTGROUP_SEQ")
    private AttachmentGroup attachmentGroup;

    private String fileName;

    private int iso;

    private String shutterSpeed;

    private String fStop;

    private String filmName;

}