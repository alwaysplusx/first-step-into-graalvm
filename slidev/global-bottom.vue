<!-- global-top.vue -->
<template>
  <footer>
    <div
      class="footer-pagenumber left-0"
      v-if="excludePages.indexOf($slidev.nav.currentPage) < 0"
    >
      {{ $slidev.nav.currentPage }} / {{ $slidev.nav.total }}
    </div>
    <div class="absolute right-0">@wuxin</div>
  </footer>
</template>

<script>
export default {
  data() {
    return {
      excludePages: [1, 2, 6, 15],
    };
  },
};
</script>

<style scoped>
footer div {
  display: inline;
  position: absolute;
  bottom: 0px;
  font-size: 6px;
  color: rgb(92 29 149 / 42%);
}
.footer-pagenumber {
  padding-left: 10px;
}
</style>