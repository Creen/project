# project
Онлайн магазин готовой еды. Пользователь в личном кабинете, заполняет информацию о себе, выбирает цель: похудеть, набрать, держать форму. На основе этой информации рассчитывается меню рацион с учетом ккал и БЖУ.

<b>Выделенные сущности: </b>
--------------
1) User c полями: 
- userId; 
- login; 
- password;
- UserMainInfo userMainInfo;
- UserParameters userParameters;
- Menu menu;

2) UserMainInfo c полями: 
- userInfoId;
- firstname;
- lastname;
- phone;
- email;
- address;
- User user;

3) UserParameters c полями:  
- userParametersId;
- gender;
- age;
- height;
- weight;
- LevelActivity levelActivity;
- User user;

4) Menu c полями: 
- menuId;
- Target target;
- Days days;
- Dish dish;
- User user;

5) Dish
- dishId;
- IngestionType ingestionType;
- kcal;
- proteins;
- fats;
- carbohydrates;
- price;

<b>Выделенные перечесления: </b>
-------------
1) LevelActivity: 

- PASSIVE("Passive lifestyle"),
- AVERAGE("Easy exercise 1-3 times a week"),
- INCREASED("Active workout 3-5 times a week"),
- HIGH("Heavy physical activity 6-7 times a week"),
- EXTREME("Intensive training 2 times a day");

2) Target:

- FIT("Lose weight"),
- POWER("Increase muscle mass"),
- BALENCE("Balanced nutrition to maintain form");

3) Day:

- MONDAY,
- TUESDAY,
- WADNESDAY,
- THURSDAY,
- FRIDAY,
- SATURDAY,
- SUNDAY;

4) IngestionType:

- BREAKFAST("Breakfast"),
- RUNCH("Brunch"),
- LUNCH("Lunch"),
- DINNER("Dinner"),
- SUPPER("Supper");



