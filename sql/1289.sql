select s.student_id,
       s.student_name,
       e.subject_name# , e.attended_exams
from Students s,
     Examinations e
         right join
     Subjects su
     on
         su.subject_name = e.subject_name or su.subject_name IS NULL
where s.student_id = e.student_id
group by s.student_name, e.subject_name;

select e.student_id, e.subject_name
from Subjects su
         left join Examinations e
                   on su.subject_name = e.subject_name;

select s.student_id, s.student_name, su.subject_name
from Students s,
     Subjects su,
     (select student_id, subject_name, count(subject_name)
      from Examinations e
      group by student_id, subject_name
      order by student_id) as ec
where (s.student_id, su.subject_name) in (ec.student_id, ec.subject_name)
order by s.student_id, su.subject_name;



select s.student_id, s.student_name, su.subject_name, count(e.student_id) as attended_exams
from Students s
         join Subjects su
         left join Examinations e
                   on e.student_id = s.student_id and e.subject_name = su.subject_name
group by su.subject_name, s.student_id
order by s.student_id, su.subject_name;



select stu.student_id, stu.student_name, sub.subject_name, count(e.student_id) as attended_exams
from Subjects sub
         join Students stu
         left join Examinations e
                   on e.subject_name = sub.subject_name and e.student_id = stu.student_id
group by sub.subject_name, stu.student_id
order by stu.student_id, sub.subject_name;









