<bean id="CL_ITEM_CATEGORIES" parent="AbstractJdbcCodeList" >
    <property name="querySql"
        value="SELECT item_category_id, item_category_name FROM item_category ORDER BY item_category_id" /> <!-- (6) -->
    <property name="valueColumn" value="item_category_id" />
    <property name="labelColumn" value="item_category_name" />
</bean>