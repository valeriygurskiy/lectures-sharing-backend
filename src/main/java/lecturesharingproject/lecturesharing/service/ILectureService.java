package lecturesharingproject.lecturesharing.service;

import lecturesharingproject.lecturesharing.entity.Lecture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ILectureService {

    Lecture insertLecture(Lecture lecture);

    List<Lecture> getAllLectures();

    Lecture getLecture(int id);

    void removeLecture(int id);

    List<Lecture> getTeacherLectures(String teacher);

    List<Lecture> findTeacherCheckedLecture(String teacher);
    List<Lecture> findTeacherUncheckedLecture(String teacher);

}
