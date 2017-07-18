package sy.qust.three.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sy.qust.three.domain.Subject_three;
import sy.qust.three.service.SubjectService;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class SubjectAction extends ActionSupport implements ModelDriven<Subject_three> {
   private Subject_three subject_three=new Subject_three();
    @Override
    public Subject_three getModel() {
        return subject_three;
    }
    private SubjectService subjectService;

    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }


}
