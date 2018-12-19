import React, {Component} from 'react';
import Request from '../../helpers/Request.js';
import ArticleForm from '../../components/article/ArticleForm.js';
import './ArticleFormContainer.css';
class ArticleFormContainer extends Component {
  constructor(props){
    super(props);
    this.state = {
      articles: [],
      journalist: []
    };

    this.handleArticlePost = this.handleArticlePost.bind(this);
  }

  componentDidMount(){
    console.log("ArticleForm Container: Component did Mount");
    const request = new Request();
    request.get("/articles").then( (data) => {
      this.setState({articles: data._embedded.articles})
    })

    request.get("/journalists").then((data) => {
      this.setState({journalist: data._embedded.journalists})
    })


  }

  handleArticlePost(article, journalistId){
    const request = new Request();

    request.post('/articles', article).then( () => {
      window.location = '/'
    })
  }

  render(){
    return (
      <ArticleForm
        articles={this.state.articles}
        journalists={this.state.journalist}
        handleArticlePost={this.handleArticlePost}
      />
    )
  }
}


export default ArticleFormContainer;
