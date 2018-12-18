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
    }

    this.handleArticlePost = this.handleArticlePost.bind(this);
  }

  componentDidMount(){
    console.log("Component did Mount");
    const request = new Request();
    request.get("/journalists").then((data) => {
      this.setState({journalists: data._embedded.journalists})
    })

    request.get("/articles").then((data) => {
      this.setState({articles: data._embedded.articles})
    })
  }

  handleArticlePost(article, journalistId){
    const request = new Request();
    request.post('/', article).then( () => {
      window.location = '/'
    })
  }

  render(){
    return (
      <ArticleForm
        articles={this.state.articles}
        journalists={this.state.journlists}
        handleArticlePost={this.handleArticlePost}
      />
    )
  }
}


export default ArticleFormContainer;
