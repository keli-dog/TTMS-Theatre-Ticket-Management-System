<template>
  <div>

    <ul>
      <li>
        <!-- table标签的height表示只少500 -->
        <table border="3" width="500" height="400" cellspacing="0">
          <!-- 表格标题 -->
          <caption>学生信息表</caption>
          <!-- 表格头部 -->
          <!-- thead标签的height表示准确值 -->
          <thead height="40" align="center" valign="bottom">
          <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>年级</th>
            <th>籍贯</th>
            <th>政治面貌</th>
          </tr>
          </thead>
          <!-- 表格主题 -->
          <!-- tbody标签的height必须总和大于table的height -->
          <tbody align="center" valign="middle">
          <tr>
            <td>张三</td>
            <td>男</td>
            <td>18</td>
            <td>高二</td>
            <td>四川</td>
            <td>团员</td>
          </tr>
          <tr>
            <td>刘四</td>
            <td>男</td>
            <td>18</td>
            <td>高二</td>
            <td>哈尔滨</td>
            <td>团员</td>

          </tr>
          <tr>
            <td>王麻子</td>
            <td>男</td>
            <td>19</td>
            <td>高二</td>
            <td>安徽</td>
            <td>群众</td>
          </tr>
          <tr>
            <td>王妹</td>
            <td>女</td>
            <td>18</td>
            <td>高二</td>
            <td>新疆</td>
            <td>党员</td>
          </tr>
          <tr>
            <td>刘天</td>
            <td>男</td>
            <td>20</td>
            <td>大二</td>
            <td>陕西</td>
            <td>群众</td>
          </tr>
          <tr>
            <td>耿泽雨</td>
            <td>男</td>
            <td>21</td>
            <td>大二</td>
            <td>陕西</td>
            <td>团员</td>
          </tr>
          </tbody>
          <!-- 表格脚注 -->
          <tfoot height="40" align="center" valign="middle">
          <tr>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td>共计:6人</td>
          </tr>
          </tfoot>
        </table>
      </li>
      <li>
        <table border="1" height="400" width="500">
          <caption>学生课程表</caption>
          <thead height="25" align="center" callspacing="middle" bgcolor="pink">
          <tr>

            <th width="40"></th>
            <th>节次</th>
            <th>周一</th>
            <th>周二</th>
            <th>周三</th>
            <th>周四</th>
            <th>周五</th>

          </tr>
          </thead>
          <tbody align="center" bgcolor="grey">
          <tr>
            <td rowspan="4">上午</td>
            <td>1</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>

            <td>2</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>

            <td>3</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>

            <td>4</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <td colspan="7"  height="25" bgcolor="green">午自习</td>
          </tr>
          <tr>
            <td rowspan="3">下午</td>
            <td>5</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>

            <td>6</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          <tr>

            <td>7</td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
          </tr>
          </tbody>
          <tfoot></tfoot>
        </table>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "test"
}
</script>
<style scoped>

</style>
