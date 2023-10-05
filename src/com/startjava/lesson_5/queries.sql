\qecho 'Выведите всю таблицу'
SELECT * FROM jaegers;

\qecho 'Отобразите только не уничтоженных роботов'
SELECT * FROM jaegers
WHERE status = 'Active';

\qecho 'Отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT * FROM jaegers
WHERE mark IN (1, 4);

\qecho 'Отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT * FROM jaegers
WHERE mark NOT IN (1, 4);

\qecho 'Отсортируйте таблицу по убыванию по столбцу mark'
SELECT * FROM jaegers
ORDER BY mark DESC;

\qecho 'Отобразите информацию о самых старых роботах'
SELECT * FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers);

\qecho 'Отобразите роботов, которые уничтожили больше всех kaiju'
SELECT * FROM jaegers
WHERE kaiju_kill = (SELECT MAX(kaiju_kill) FROM jaegers);

\qecho 'Отобразите средний вес роботов, округлив его до трех знаков после запятой'
SELECT ROUND(AVG(weight), 3) "Cредний вес роботов" FROM jaegers;

\qecho 'Увеличьте на единицу количество уничтоженных kaiju у роботов,'
\qecho  'которые до сих пор не разрушены, а затем отобразите таблицу'
UPDATE jaegers
SET kaiju_kill = kaiju_kill + 1
WHERE status = 'Active';
SELECT * FROM jaegers;

\qecho 'Удалите уничтоженных роботов, а затем отобразите оставшихся'
DELETE FROM jaegers
WHERE status = 'Destroyed';
SELECT * FROM jaegers;
