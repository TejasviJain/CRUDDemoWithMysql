package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Author;
import com.example.demo.model.Post;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;

@Controller
@RequestMapping("/main")
public class MainController 
{
	@Autowired
	private AuthorRepository authorrepo;
	
	@Autowired
	private PostRepository postrepo;
	
	@RequestMapping("/")
	public String AuthorList(Model model)
	{
		//Author author = new Author();
		model.addAttribute("listofauthor",authorrepo.findAll());
		return "AuthorDetails";
	}
	
	@RequestMapping("/newauthor")
	public String getAuthor(Model model)
	{
		Author author = new Author();
		model.addAttribute("getauthor",author);
		return "CreateAuthor";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String SaveAuthor(@ModelAttribute("author")Author author)
	{
		authorrepo.save(author);
		return "redirect:/main/";
	}
	
	@RequestMapping(value="/edit/{id}")
	public String UpdateAuthor(Model model,@PathVariable (name= "id")long id )
	{
		model.addAttribute("editauthor", authorrepo.findById(id));
		return "UpdateAuthor";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteAuthor(@PathVariable(name = "id") long id) {
		authorrepo.deleteById(id);
		return "redirect:/main/";		
	}
	
	@RequestMapping("/postlist")
	public String PostList(Model model)
	{
		//Author author = new Author();
		model.addAttribute("listofpost",postrepo.findAll());
		return "PostDetails";
	} 

	@RequestMapping("/newpost") public String getPost(Model model)
	{ 
		Post post =new Post(); 
		model.addAttribute("getpost",post); 
		return "CreatePost"; 
	}
	  
	
	@RequestMapping(value="/savepost",method=RequestMethod.POST) 
	public String SavePost(@ModelAttribute("post")Post post) 
	{ 
		Author author = new Author();
		Post post1 =new Post(); 
		post1.setAuthor(author);
		postrepo.save(post); 
		return "redirect:/main/postlist/"; 
	}
	
	@RequestMapping(value="/editpost/{id}")
	public String UpadtePost(Model model,@PathVariable (name="id")long id)
	{
		model.addAttribute("updatepost", postrepo.findById(id));
		return "UpdatePost"; 
	}
	
	@RequestMapping(value="/deletepost/{id}")
	public String DeletePost(Model model,@PathVariable (name="id")long id)
	{
		postrepo.deleteById(id);
		return "redirect:/main/postlist/"; 
	}
	
	
	 
}
