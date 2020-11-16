package com.java.study.test;

public class Test {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder("select ttt.* from ( SELECT rownum as num, tt.* FROM (SELECT ajt.monPointId, a.*,ac.name AS area_name, CASE ");
        sql.append(" WHEN prs.FIRE_NO<>'null' and nvl(prs.FIRE_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.WARNING_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.ALARM_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.FAULTY_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.EXCEPTION_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.OVERHAUL_NO, 0) > 0 THEN 2");
        sql.append(" WHEN nvl(prs.ACTION_NO, 0) > 0 THEN 0");
        sql.append(" WHEN nvl(prs.ONLINE_NO, 0) > 0 THEN 0");
        sql.append(" WHEN nvl(prs.OFFLINE_NO, 0) > 0 THEN 1");
        sql.append(" ELSE 0 END AS status");
        sql.append(" FROM waternetwork a LEFT JOIN areacode ac ON a.area_id = ac.area_id ");
        sql.append(" LEFT JOIN prj_realstate prs ON ((a.belongId is null and a.waternetwork_id = prs.areaprj_id) or a.belongId = prs.areaprj_id)  AND prs.type = 2 left join ");
        sql.append(" (select act.name,max(act.areaprj_id) as monPointId from areaproject act group by act.name)ajt on ajt.name=a.name WHERE a.enabled = 1");
        sql.append(" AND EXISTS ( SELECT 1 FROM user_waternetwork_role uwt WHERE uwt.waternetwork_id = a.waternetwork_id AND uwt.sysuser_id = ").append(644).append(" )");
        sql.append(" order by status desc ) tt where 1 = 1");

        sql.append(" AND tt.status = ").append("2");
        sql.append(" ) ttt where ttt.num  between 0 and 10 ");
        System.out.println(sql.toString());
    }
}
