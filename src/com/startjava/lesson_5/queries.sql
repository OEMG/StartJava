\qecho 'Выведите всю таблицу'
SELECT *
  FROM jaegers
 ORDER BY model_name;

\qecho 'Отобразите только не уничтоженных роботов'
SELECT *
  FROM jaegers
 WHERE status = 'Active'
 ORDER BY model_name;

\qecho 'Отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark IN (1, 4)
 ORDER BY model_name;

\qecho 'Отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT *
  FROM jaegers
 WHERE mark NOT IN (1, 4)
 ORDER BY model_name;

\qecho 'Отсортируйте таблицу по убыванию по столбцу mark'
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\qecho 'Отобразите информацию о самых старых роботах'
SELECT *
  FROM jaegers
 WHERE launch = (SELECT MIN(launch)
                   FROM jaegers)
 ORDER BY model_name;

\qecho 'Отобразите роботов, которые уничтожили больше всех kaiju'
SELECT *
  FROM jaegers
 WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
                       FROM jaegers)
 ORDER BY model_name;

\qecho 'Отобразите средний вес роботов, округлив его до трех знаков после запятой'
SELECT ROUND(AVG(weight), 3) AS avg_weight
  FROM jaegers;

\qecho 'Увеличьте на единицу количество уничтоженных kaiju у роботов,'
\qecho 'которые до сих пор не разрушены, а затем отобразите таблицу'
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status = 'Active';
SELECT *
  FROM jaegers
 ORDER BY model_name;

\qecho 'Удалите уничтоженных роботов, а затем отобразите оставшихся'
DELETE FROM jaegers
 WHERE status = 'Destroyed';
SELECT *
  FROM jaegers
 ORDER BY model_name;
