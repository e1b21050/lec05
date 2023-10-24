package oit.is.team0805.lec05.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import oit.is.team0805.lec05.model.Fruit;
import oit.is.team0805.lec05.model.FruitMapper;
import oit.is.team0805.lec05.service.AsyncShopService57;

/**
 * /sample5へのリクエストを扱うクラス authenticateの設定をしていれば， /sample5へのアクセスはすべて認証が必要になる
 * 他のクラスと同じRequestMappingも書ける．ただし，特定のメソッドへのGETリクエストのURLは一意じゃないとだめ．
 */
@Controller
@RequestMapping("/sample5")
public class Sample57Controller {

  @Autowired
  FruitMapper fMapper;

  @Autowired
  AsyncShopService57 shop57;

  /**
   * これまでと同様，フルーツのリストをDBから取得してthymeleafで返す処理
   *
   * @param model
   * @return
   */
  @GetMapping("step7")
  public String sample57(ModelMap model) {
    final ArrayList<Fruit> fruits7 = shop57.syncShowFruitsList();
    model.addAttribute("fruits7", fruits7);
    return "sample57.html";
  }
}
