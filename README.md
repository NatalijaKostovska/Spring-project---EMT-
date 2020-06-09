Симнете го дадениот zip, отпакувајте го, и отворете го pom.xml фајлот преку IntelliJ IDEA.
Задачата исто така ја имате и во README.md фајлот во проектот.

Во pom.xml се додадени сите потребни зависности, така што не треба да менувате.
Треба да имате стабилна интернет врска за да се преземат сите зависности. 
Ако имате проблем со преземањето, отворето го pom.xml, кликнете десен клик -> Maven -> Reimport.

Дадена е конфигурација за H2 база на податоци (може да ја пристапите на /h2) во application.properties која нема потреба да ја менувате, 
освен ако не сакате да користите ваша mysql/postgres (за кои веќе има додадено dependencies) за да се зачувуваат податоците при рестартирање на апликацијата.


Потребно е да се изработи апликација за менаџирање на вработени и оддели (Employee и Department).

Дадени се потребните модели и исклучоци кои треба соодветно да ги дополнете и анотирате (може да си додадете и ваши исклучоци и класи по потреба). 
Моделите треба да се анотираат за да се перзистираат во база.
Релацијата на вработен со оддел е следна: Еден вработен може да работи во повеќе оддели и во еден оддел може да работат повеќе вработени.


Во делот за темплејти има една departments.html страна која треба да ја пополнете со thymeleaf синтакса за соодветните барања.
Оваа страна треба да се појави на патеката /departments.
Доколку некој пристапи на / или /home, потребно е да биде редиректиран на /departments.
На оваа страна се прикажува табела од оддели во формат:

[ име на оддел | број на вработени | вработени | копче за бришење на одделот ] 

За секој оддел има опција и да се избрише, но доколку има вработени кои работат во овој оддел, не треба да се дозволи да се избрише (ќе се прикаже порака во делот за ErrorMessage во html страната).

Под табелата има форма за внесување на нов оддел, така што се внесува само „name“ за одделот.
Одделот има примарен клуч (ид) кој автоматски се зголемува при секое ново креирање на оддел.
Одделот се внесува без вработените. 

При успешно зачувување на одделот, автоматски се додава во табелата. 


За овие функционалности треба да се креираат соодветни Controllers (треба да ги дополнете).
Креиран е и HomeController, кој може да не го користите доколку сакате.



Делот за додавање на вработени, треба да биде преку REST Controller (треба да го дополните).

За секој вработен се чува username (примарен клуч), име и презиме (fullName), датумот кога е креиран вработениот (се внесува пред да се зачува вработениот) и листа од оддели во кои работи овој вработен.
Овој контролер ќе овозможи: 
- листање на сите вработени, 
- додавање на нов вработен - доколку се внесе вработен со ист username треба да се фрли исклучок.
- едитирање на вработен, 
- бришење на вработен -  што значи дека ќе се избрише и релацијата со сите оддели во кои работи.
- додавање на вработен во даден оддел
- бришење на вработен од даден оддел

Сите овие функционалности се дадени во сервисот EmployeeService за кој треба да напишете имплементација.
Даден е и DepartmentService за кој исто така треба да напишете имплементација.

Дополнително, во сервисите имате и други функционалности и сите методи ви се објаснети подетално.


Дополнете ги repositories за дадените ентитети за да може да се зачуваат и да се допишат дополнителните методи кои се потребни за сервисниот слој.


Не сте ограничени на овие класи, слободно може да ги менувате и додавате нови.


КОДОТ ЌЕ СЕ ПРОВЕРУВА ЗА ПЛАГИЈАТИ, 
ТАКА ШТО СЕКОЈ СТУДЕНТ ЌЕ БИДЕ КАЗНЕТ СО ГУБЕЊЕ НА ПРАВОТО НА ПОТПИС.


Бодување:
Model: 15
Controllers: 25
Services: 30
Repositories: 15
Thymeleaf: 10
Целосна функционалност: 10






