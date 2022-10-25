<template>
  <div>
    <table>
      <tr>
        <th>文章编号</th>
        <th>文章标题</th>
        <th>文章作者</th>
      </tr>
      <tr v-for="blog in blogs">
        <td>{{blog.id}}</td>
        <td>{{blog.title}}</td>
        <td>{{blog.author}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      blogs: [
        {
          id: '1001',
          title: '如何使用Vue',
          author: '张三'
        },
        {
          id: '1002',
          title: '如何使用springBoot',
          author: '李四'
        }
      ]
    }
  }
}
</script>

<style scoped>
  table {
    border: red;
    color: forestgreen;
    background-color: burlywood;
  }

</style>