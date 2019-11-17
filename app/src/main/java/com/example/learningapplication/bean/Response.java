package com.example.learningapplication.bean;

import java.util.List;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description:
 **/
public class Response {
    public static final String JSON_DATA = "[{\n" +
            "      \"createTime\": \"2019-11-17 15:24:31\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 108,\n" +
            "      \"images\": [\n" +
            "        \"img/process/1bd07dc5-3def-4e36-bb92-e0664f801d5d.jpg\",\n" +
            "        \"img/process/68675526-2828-4e59-8db7-29ece11a6ee5.jpg\"],\n" +
            "      \"inputRecord\": \"企业肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"除草\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 15:21:35\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 107,\n" +
            "      \"images\": [\n" +
            "        \"img/process/01f79e1a-16c3-4935-9296-40ec3c025009.jpg\"],\n" +
            "      \"inputRecord\": \"test\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"选种定植\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 15:18:13\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 106,\n" +
            "      \"images\": [\n" +
            "        \"img/process/6cf19900-686c-4fb4-abbe-5ad21b24900c.jpg\",\n" +
            "        \"img/process/60e52f44-eb12-44d2-85bb-8728a6b20d85.jpg\"],\n" +
            "      \"inputRecord\": \"NESCAFE雀巢咖啡1+2原味即溶咖啡饮品\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"施肥\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 15:17:22\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 105,\n" +
            "      \"images\": [\n" +
            "        \"img/process/36f6cfdd-4cc3-4481-958a-e6b79c840fdb.jpg\"],\n" +
            "      \"inputRecord\": \"NESCAFE雀巢咖啡1+2原味即溶咖啡饮品\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"施肥\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 14:59:29\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 104,\n" +
            "      \"images\": [\n" +
            "        \"img/process/399680b0-bae2-4991-8b6f-33b950a76b23.jpg\"],\n" +
            "      \"inputRecord\": \"肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"除草\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 14:56:45\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 103,\n" +
            "      \"images\": [\n" +
            "        \"img/process/593bd086-a538-473b-a492-c19c327ad147.jpg\"],\n" +
            "      \"inputRecord\": \"肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"水分管理,除草\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 11:36:05\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 102,\n" +
            "      \"images\": [\n" +
            "        \"img/process/eb636dc2-4990-4563-9ee4-90755169a280.jpg\"],\n" +
            "      \"inputRecord\": \"企业肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"水分管理\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 11:04:10\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 101,\n" +
            "      \"images\": [\n" +
            "        \"img/process/3a66e695-8daf-4e02-b838-92a467eaaddf.jpg\",\n" +
            "        \"img/process/bc4ddd63-d4bc-4e57-9323-b9182539e1bf.jpg\"],\n" +
            "      \"inputRecord\": \"企业肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"施肥\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-17 11:00:56\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 100,\n" +
            "      \"images\": [\n" +
            "        \"img/process/41e4b4f9-8622-4019-ab1c-258432d887d8.jpg\",\n" +
            "        \"img/process/ec07cf13-bce9-4da8-929a-655e908c89df.jpg\"],\n" +
            "      \"inputRecord\": \"企业化合肥\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"水分管理,土壤管理\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-11 21:17:09\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 99,\n" +
            "      \"images\": [\n" +
            "        \"img/process/5114ebc3-4538-4dd7-8e17-2d0a891e54f8.jpg\",\n" +
            "        \"img/process/82052823-db81-432a-ad79-1b045997681c.jpg\"],\n" +
            "      \"inputRecord\": \"企业肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"选种定植,施肥,水分管理\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-11-06 14:58:04\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 98,\n" +
            "      \"images\": [\n" +
            "        \"img/process/8d0807b2-626f-4317-aad9-de6fc3725072.jpg\",\n" +
            "        \"img/process/81e2f0ff-6636-48e7-914b-98cb5bd5b7f5.jpg\",\n" +
            "        \"img/process/b6d883d2-7d2a-45ce-9c83-20bf1aa0b38e.jpg\"],\n" +
            "      \"inputRecord\": \"企业肥料,企业肥料\",\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"选种定植,施肥\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-10-07 10:54:55\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"伊利牧场\",\n" +
            "      \"id\": 97,\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"采摘,修剪,选种定植\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-10-06 17:44:37\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 96,\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"采摘,施肥,修剪\",\n" +
            "      \"remark\": \"\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-28 12:18:24\",\n" +
            "      \"cropId\": 191,\n" +
            "      \"cropName\": \"金萱\",\n" +
            "      \"fieldName\": \"伊利牧场\",\n" +
            "      \"id\": 95,\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"采摘\",\n" +
            "      \"remark\": \"\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-28 12:13:46\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 94,\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"采摘\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-28 12:06:59\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 93,\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"选种定植,施肥,水分管理\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-26 15:37:03\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 92,\n" +
            "      \"images\": [\n" +
            "        \"img/process/76a780ce-ad34-4dc0-a48b-83002792e29a.jpg\",\n" +
            "        \"img/process/e72047f7-ec9c-4d17-a35d-66806ebdde5e.jpg\"],\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"防治病虫害,采摘\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-26 15:36:36\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 91,\n" +
            "      \"images\": [\n" +
            "        \"img/process/a566ddbe-9fa8-4799-b6f3-6d51d0941e2c.jpg\",\n" +
            "        \"img/process/cb2b92f3-66c1-4677-b210-2582275af4a8.jpg\"],\n" +
            "      \"location\": \"纬度：23.16；经度：113.35\",\n" +
            "      \"operation\": \"选种定植,施肥,修剪\",\n" +
            "      \"remark\": \"灌溉\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-24 11:08:43\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 88,\n" +
            "      \"images\": [\n" +
            "        \"img/process/00efe3bc-faec-4c4c-8b42-0234ea5779b0.jpg\",\n" +
            "        \"img/process/ec73d618-1d54-4c72-9a36-b0b76fd1e2b5.jpg\"],\n" +
            "      \"inputRecord\": \"企业化合肥\",\n" +
            "      \"location\": \"纬度：0.00；经度：0.00\",\n" +
            "      \"operation\": \"施肥,除草\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }, {\n" +
            "      \"createTime\": \"2019-09-24 10:59:16\",\n" +
            "      \"cropId\": 192,\n" +
            "      \"cropName\": \"清心一号\",\n" +
            "      \"fieldName\": \"田块A\",\n" +
            "      \"id\": 87,\n" +
            "      \"images\": [\n" +
            "        \"img/process/7a70befc-7b9b-49a8-bbfe-5cc7ef78b21f.jpg\",\n" +
            "        \"img/process/a975e23c-a70f-4016-90bf-8ef631ab9a87.jpg\"],\n" +
            "      \"location\": \"位置信息：纬度：23.16;经度：113.35\",\n" +
            "      \"operation\": \"施肥,水分管理\",\n" +
            "      \"weather\": \"多云\"\n" +
            "    }]";
}
