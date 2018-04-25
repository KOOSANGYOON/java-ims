package codesquad.web;

<<<<<<< HEAD
=======
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
>>>>>>> 2ba5733f5080f8043e055d058b956d40ab59bea8
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import codesquad.domain.IssueRepository;

@Controller
public class HomeController {
<<<<<<< HEAD
	@Autowired
	private IssueRepository issueRepository;
	
	@GetMapping("/")
	public String home(Model model) {
=======
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IssueRepository issueRepository;

	@GetMapping("/")
	public String home(Model model) {
		log.debug("test");
>>>>>>> 2ba5733f5080f8043e055d058b956d40ab59bea8
		model.addAttribute("issues", issueRepository.findByDeleted(false));
		return "index";
	}
}
